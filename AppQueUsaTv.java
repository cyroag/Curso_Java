public class AppQueUsaTv{
    public static void main(String args[]){

        int opcao;
        Televisao t = new Televisao();
        t.marca = "Samsung";
        t.tamanhoTela = 42;
        t.ligada = false;
        t.canal = 5;
        t.volume = 10;

        Televisao x = new Televisao();
        x.marca = "LG";
        x.tamanhoTela = 55;
        x.ligada = true;
        x.canal = 9;
        x.volume = 5;

        do{
            System.out.println("0:POWER / 1:Canal+ / 2:Canal- / 3:Vol+ / 4:Vol- / 5:Mute / -1:Exit");
            switch(opcao){
                case 0{
                    t.power();
                    break;
                }
                case 1{
                    t.avancarCanal();
                    break;
                }
                case 2{
                    t.diminuirCanal();
                    break;
                }
                case 3{
                    t.aumentarVolume();
                    break;
                }
                case 4{
                    t.diminuirVolume();
                    break;
                }
                case 5{
                    t.mutar();
                    break;
                }
                case -1{
                    break;
                }
            }
        }while(opcao != -1);
    }
}