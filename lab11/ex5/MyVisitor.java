package ex5;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicLong;

public class MyVisitor {
    public AtomicLong GetSize(String path, boolean r) {
        Path start = Paths.get(path);
        AtomicLong size = new AtomicLong(0);


        try {
        Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
                String[] pathArr = file.toString().split("/");
                String[] root = start.toString().split("/");
                String d = pathArr[pathArr.length - 2];
                String f = pathArr[pathArr.length - 1];

                if(!d.equals(root[root.length - 1])){
                    if (!r)
                        return FileVisitResult.CONTINUE;
                    f = d + "/" + f;
                }
                
                long fsize = attrs.size();
                System.out.println("\t" + f + " - " + fsize + " kb");
                size.addAndGet(attrs.size() / 1024);
                return FileVisitResult.CONTINUE;
            }
        });

        return size;
       
    } catch (IOException e) {
        System.out.println("Error! Couldn't process path: " + e.getMessage());
        System.exit(1);
        }

        return null;
    }
}