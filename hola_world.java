class Main {
//I am at work so I don't have access to terminal
  public static void main(String[] args) {
    String ordinal = " ";
    String gift = " ";
    
    for (int i=1; i <= 12; i++) {
      
      switch(i) {
        case 1: ordinal = "st";
        		gift = "a partridge in a pear tree.";
            break;
        case 2: ordinal = "nd";
        		gift = "two turtle doves and" + '\n' + gift;
            break;
        case 3: ordinal = "rd";
        		gift = "three french hens," + '\n' + gift;
            break;
        case 4: ordinal = "th";
        		gift = "four Calling Birds," + '\n' + gift;
            break;
        case 5: ordinal = "th";
        		gift = "five Golden Rings," + '\n' + gift;
            break;
        case 6: ordinal = "th";
        		gift = "six Geese a Laying," + '\n' + gift;
            break;
        case 7: ordinal = "th";
        		gift = "seven Swans a Swimming," + '\n' + gift;
            break;
        case 8: ordinal = "th";
        		gift = "eight Maids a Milking," + '\n' + gift;
            break;
        case 9: ordinal = "th";
        		gift = "nine Ladies Dancing," + '\n' + gift;
            break;
        case 10: ordinal = "th"; 
        		 gift = "ten Lords a Leaping," + '\n' + gift;
            break;
        case 11: ordinal = "th";
        		 gift = "eleven Pipers Piping," + '\n' + gift;
            break;
        case 12: ordinal = "th";
        		 gift = "twelve Drummers Drumming" + '\n' + gift;
            break;    
      }
      System.out.print("\nOn the " + i + ordinal + " day of Christmas" + '\n' + "my true love gave to me" + '\n' + gift + '\n'); 
 
   // System.out.print(gift + '\n' + '\n'); 
    }
    }
  }