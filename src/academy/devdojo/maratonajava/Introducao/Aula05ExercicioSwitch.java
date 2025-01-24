package acadademy.devdojo.maratonajava.introducao;

public class Aula05ExercicioSwitch {
    public static void main (String[] args) {

//        String diaUtil = "Dia Util";

        byte dia = 1;

//        switch (dia) {
//
//            default:
//                System.out.print("Opção Inválida!");
//
//            case 1:
//                System.out.println("Domingo não é dia útil");
//                break;
//            case 2:
//                System.out.println("Segunda é dia útil");
//                break;
//            case 3:
//                System.out.println("Terça é dia útil");
//                break;
//            case 4:
//                System.out.println("Quarta é dia útil");
//                break;
//            case 5:
//                System.out.println("Quinta é dia útil");
//                break;
//            case 6:
//                System.out.println("Sexta é dia útil");
//                break;
//            case 7:
//                System.out.println("Sábado não é dia útil");
//                break;
//        }

        // Maneira burra !


        // Maneira Foda !
        switch (dia) {
            default:
                System.out.println("Opção Inválida!");
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
        }

    }
}
