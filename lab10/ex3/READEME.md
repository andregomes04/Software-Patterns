https://www.geeksforgeeks.org/mediator-design-pattern/

1) O problema: Como reduzir a dependencia entre objetos (que os tornam dificeis de reutilizar)?

2) Solução: uso de um mediador; O mediador permite o desacoplamento de objetos introduzindo uma camada intermediária para que a interação entre os objetos ocorra via essa camada. Temos como analogia para a vida real o exemplo de um controlador de tráfego aéreo (mediator), que faz acontecer a comunicação entre diferentes voos. 

No caso do ficheiro agregado:

    IATCMediator: o nosso mediator; serve como interface para o nosso concreteMediator (ATCMediator);

    As classes Runway e Flight são aquelas que queremos fazer comunicar sem um alto acopolamento; para tal, inicializamos cada uma delas com uma instancia de IATCMediator; a comunicação é definida com base nas funções presentes na interface IATCMediator (registerRunway(); registerFlight(); isLandingOk(); setLandingStatus()), i.e. por exemplo, na função 'land()', definida em 'Flight', o comportamento muda baseado no mediator;

    public void land()
    {
        if (atcMediator.isLandingOk())
        {
            System.out.println("Successfully Landed.");
            atcMediator.setLandingStatus(true);
        }
        else
            System.out.println("Waiting for landing.");
    }

    Fazendo para as outras funções o que foi feito nesta, chegamos ao objetivo de ter comunicação entre várias classes sem que haja alto acopolamento (ou seja, baixa dependencia);