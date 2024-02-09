package ex1;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

abstract class PluginManager{
    public static IPlugin load(String name) throws Exception{
        Class<?> c = Class.forName(name);
        return (IPlugin) c.getDeclaredConstructor().newInstance();
    }
}

public class Plugin {
    public static void main(String[] args){

        File currencylist = new File("ex1/Plugins");
        ArrayList<IPlugin> plgs = new ArrayList<IPlugin>();
        for (String f: currencylist.list()){
            if(f.endsWith(".java")){
                try { plgs.add(PluginManager.load("ex1.Plugins." + f.substring(0, f.lastIndexOf('.'))));
            } catch (Exception e){
                System.out.println("NOT A PLUGIN");
            }
            }
        }

        Iterator<IPlugin> it = plgs.iterator();
        Iterator<IPlugin> it2 = plgs.iterator();

        MyBank b = new MyBank(1234, 25362.02, 123456); // como o objetivo é testar apenas os plugins, temos apenas um banco
        Scanner sc = new Scanner(System.in);  
        Scanner currencyScan =  new Scanner(System.in);              // caso contrário, teriamos uma list da MyBank
        System.out.println("Welcome to the bank, please insert your account number:\n");
        int useracc = sc.nextInt();  // Read user input
        if(b.getAccNum()==useracc){
            System.out.println("Password:\n");
            int pass = sc.nextInt();
            if(b.getPswd()==pass){
                System.out.println("Welcome! How do you wanna check your balance?\n");
                while(it.hasNext()){
                    String method = it.next().getClass().getSimpleName();
                    System.out.println("----" + method + "-----");
                }
                String currency;
                System.out.println("Please enter the currency:");
                currency = currencyScan.nextLine();
                
                while(it2.hasNext()){
                    if (currency.equals(it2.next().getClass().getSimpleName())){
                        double balance = it2.next().showBalance(b);
                        System.out.println(balance);
                    }
                }
                
            }else{
                System.out.println("Wrong Password!!\n");
                System.exit(1);
            }
        }else{
            System.out.println("No account by that number!!\n");
            System.exit(1);
        }
        sc.close();
        currencyScan.close();
    }
}
