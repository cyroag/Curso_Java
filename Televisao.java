public class Televisao{
    String marca;
    int tamanhoTela;
    int canal;
    int volume;
    boolean ligada;

    void power(){
        ligada = !ligada;
        System.out.println("A TV "+marca+" esta "+ligada+" agora");
    }

    void aumentarVolume(){
        if(ligada == true){
            if(volume < 10){
                volume++;
                System.out.println("Volume: "+volume);
            }
            else{
                System.out.println("Volume está no máximo");
            }
        }
        else{
            System.out.println("Por favor, ligue a TV "+marca);
        }
    }

    void diminuirVolume(){
        if(ligada == true){
            if(volume > 0){
                volume--;
                System.out.println("Volume: "+volume);
            }
            else{
                System.out.println("Volume está no mínimo");
            }
        }
        else{
            System.out.println("Por favor, ligue a TV "+marca);
        }
    }

    void mutar(){
        if(ligada == true){
            if(volume == 0){
                System.out.println("Volume já está no mute");
            }
            else{
                volume = 0;
                System.out.println("Volume mutado");
            }
        }
        else{
            System.out.println("Por favor, ligue a TV"+marca);
        }
    }

    void avancarCanal(){
        if(ligada == true){
            if(canal < 99){
                canal++;
                System.out.println("Canal: "+volume);
            }
            else{
                System.out.println("Canal está no limite máximo");
            }
        }
        else{
            System.out.println("Por favor, ligue a TV "+marca);
        }
    }

    void diminuirCanal(){
        if(ligada == true){
            if(canal > 1){
                canal--;
                System.out.println("Canal: "+volume);
            }
            else{
                System.out.println("Canal está no limite mínimo");
            }
        }
        else{
            System.out.println("Por favor, ligue a TV "+marca);
        }
    }


        
    
}