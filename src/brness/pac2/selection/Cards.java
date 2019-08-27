package brness.pac2.selection;

public class Cards {
    public static void main(String[] args){
        int x=(int)(Math.random()*52);
        System.out.println("The number is "+x);
        int color=x/13;
        switch (color){
            case 0:switch (x%13){
                case 0:System.out.println("Ace of Clubs");break;
                case 1:System.out.println("2 of Clubs");break;
                case 2:System.out.println("3 of Clubs");break;
                case 3:System.out.println("4 of Clubs");break;
                case 4:System.out.println("5 of Clubs");break;
                case 5:System.out.println("6 of Clubs");break;
                case 6:System.out.println("7 of Clubs");break;
                case 7:System.out.println("8 of Clubs");break;
                case 8:System.out.println("9 of Clubs");break;
                case 9:System.out.println("10 of Clubs");break;
                case 10:System.out.println("Jack of Clubs");break;
                case 11:System.out.println("Queen of Clubs");break;
                default:
                    System.out.println("King of Clubs");break;
            } break;
            case 1:switch (x%13){
                case 0:System.out.println("Ace of Diamond");break;
                case 1:System.out.println("2 of Diamond");break;
                case 2:System.out.println("3 of Diamond");break;
                case 3:System.out.println("4 of Diamond");break;
                case 4:System.out.println("5 of Diamond");break;
                case 5:System.out.println("6 of Diamond");break;
                case 6:System.out.println("7 of Diamond");break;
                case 7:System.out.println("8 of Diamond");break;
                case 8:System.out.println("9 of Diamond");break;
                case 9:System.out.println("10 of Diamond");break;
                case 10:System.out.println("Jack of Diamond");break;
                case 11:System.out.println("Queen of Diamond");break;
                default:
                    System.out.println("King of Diamond");break;
            } break;
            case 2:switch (x%13){
                case 0:System.out.println("Ace of Hearts");break;
                case 1:System.out.println("2 of Hearts");break;
                case 2:System.out.println("3 of Hearts");break;
                case 3:System.out.println("4 of Hearts");break;
                case 4:System.out.println("5 of Hearts");break;
                case 5:System.out.println("6 of Hearts");break;
                case 6:System.out.println("7 of Hearts");break;
                case 7:System.out.println("8 of Hearts");break;
                case 8:System.out.println("9 of Hearts");break;
                case 9:System.out.println("10 of Hearts");break;
                case 10:System.out.println("Jack of Hearts");break;
                case 11:System.out.println("Queen of Hearts");break;
                default:
                    System.out.println("King of Hearts");break;
            } break;
            default:
                switch (x%13){
                    case 0:System.out.println("Ace of Spades");break;
                    case 1:System.out.println("2 of Spades");break;
                    case 2:System.out.println("3 of Spades");break;
                    case 3:System.out.println("4 of Spades");break;
                    case 4:System.out.println("5 of Spades");break;
                    case 5:System.out.println("6 of Spades");break;
                    case 6:System.out.println("7 of Spades");break;
                    case 7:System.out.println("8 of Spades");break;
                    case 8:System.out.println("9 of Spades");break;
                    case 9:System.out.println("10 of Spades");break;
                    case 10:System.out.println("Jack of Spades");break;
                    case 11:System.out.println("Queen of Spades");break;
                    default:
                        System.out.println("King of Spades");break;
                }break;
        }
    }
}
