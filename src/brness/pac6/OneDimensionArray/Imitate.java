package brness.pac6.OneDimensionArray;

public class Imitate {
    public static void main(String[] args) {
        int[] x=new int[4];
        boolean k=true;
        int time=0;
        do {
            time++;
            for(int i=0;i<4;i++) {
                x[i]= (int) (Math.random() * 52 + 1);
            }
            for(int i=0;i<4;i++){
                if(x[1]/13!=x[0]/13&&x[1]/13!=x[2]/13&&x[1]/13!=x[3]/13&&x[0]/13!=x[2]/13&&x[0]/13!=x[3]/13&&x[2]/13!=x[3]/13)
                    k=false;
            }
        }while(k);

        for(int i=0;i<4;i++){
            switch (x[i]/13){
                case 0:switch (x[i]%13){
                    case 0:System.out.println("Ace of Spades");break;
                    case 1:System.out.println("Two of Spades");break;
                    case 2:System.out.println("Three of Spades");break;
                    case 3:System.out.println("Four of Spades");break;
                    case 4:System.out.println("Five of Spades");break;
                    case 5:System.out.println("Six of Spades");break;
                    case 6:System.out.println("Seven of Spades");break;
                    case 7:System.out.println("Eight of Spades");break;
                    case 8:System.out.println("Nine of Spades");break;
                    case 9:System.out.println("Ten of Spades");break;
                    case 10:System.out.println("Knight of Spades");break;
                    case 11:System.out.println("Queen of Spades");break;
                    default:System.out.println("King of Spades");break;
                } break;
                case 1:switch (x[i]%13){
                    case 0:System.out.println("Ace of Clubs");break;
                    case 1:System.out.println("Two of Clubs");break;
                    case 2:System.out.println("Three of Clubs");break;
                    case 3:System.out.println("Four of Clubs");break;
                    case 4:System.out.println("Five of Clubs");break;
                    case 5:System.out.println("Six of Clubs");break;
                    case 6:System.out.println("Seven of Clubs");break;
                    case 7:System.out.println("Eight of Clubs");break;
                    case 8:System.out.println("Nine of Clubs");break;
                    case 9:System.out.println("Ten of Clubs");break;
                    case 10:System.out.println("Knight of Clubs");break;
                    case 11:System.out.println("Queen of Clubs");break;
                    default:System.out.println("King of Clubs");break;
                } break;
                case 2:switch (x[i]%13){
                    case 0:System.out.println("Ace of Hearts");break;
                    case 1:System.out.println("Two of Hearts");break;
                    case 2:System.out.println("Three of Hearts");break;
                    case 3:System.out.println("Four of Hearts");break;
                    case 4:System.out.println("Five of Hearts");break;
                    case 5:System.out.println("Six of Hearts");break;
                    case 6:System.out.println("Seven of Hearts");break;
                    case 7:System.out.println("Eight of Hearts");break;
                    case 8:System.out.println("Nine of Hearts");break;
                    case 9:System.out.println("Ten of Hearts");break;
                    case 10:System.out.println("Knight of Hearts");break;
                    case 11:System.out.println("Queen of Hearts");break;
                    default:System.out.println("King of Hearts");break;
                } break;
                default:switch (x[i]%13){
                    case 0:System.out.println("Ace of Diamonds");break;
                    case 1:System.out.println("Two of Diamonds");break;
                    case 2:System.out.println("Three of Diamonds");break;
                    case 3:System.out.println("Four of Diamonds");break;
                    case 4:System.out.println("Five of Diamonds");break;
                    case 5:System.out.println("Six of Diamonds");break;
                    case 6:System.out.println("Seven of Diamonds");break;
                    case 7:System.out.println("Eight of Diamonds");break;
                    case 8:System.out.println("Nine of Diamonds");break;
                    case 9:System.out.println("Ten of Diamonds");break;
                    case 10:System.out.println("Knight of Diamonds");break;
                    case 11:System.out.println("Queen of Diamonds");break;
                    default:System.out.println("King of Diamonds");break;
                } break;
            }
        }
        System.out.println("Number of picks: "+time);
    }
}
