class Scanner_Method {
  static   Scanner    sc   =  new Scanner(System.in);  
       // [ClasName] [obj]   ['new' memory allocation for inputed value , for every time obj used .
       // [keyword] 
    
       
      public static void rectangle(){
           double width = 0 ;
           double length = 0 ;
           double area = 0 ;
        System.out.print("Enter the Width : " );
        width = sc.nextDouble();
        System.out.print("Enter the length : " );
        length = sc.nextDouble();
        
        area = width * length ;
        System.out.print("Enter the Area : " + area + " cm²"  ); // '²' is done using "hold-[ALT] + press_keys-0178"
        
    } 
    
    public static void main (String[] args) {
       
        System.out.print("Enter Your FIRST Name : ");
        String name = sc.next(); // next() inputs single word, while nextline() i/p line of string 
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();  // nextInt() takes 'Integer' as value 
        
        // When you use nextInt() or next(), it doesn't consume the newline (\n). So when you call nextLine() immediately after, 
        //  it just takes that leftover newline as input and skips waiting for the user.
        sc.nextLine();      // this captures the extra '\n' from integer input and remove "input skip bug "
        System.out.print("Enter color (skipped inputed Bug ) : ");
        String color = sc.nextLine();
    
        System.out.print("\nAre you Student (true/false) : ");
        boolean isStudent = sc.nextBoolean();  //take 'true/false' as value 
        System.out.println("Hello, " + name + "\nyou are " + age + " years old .");
        if(isStudent){  
            System.out.println(name + " is a student .");
            System.out.println("You will get " + color + " Uniform ."); 
        }
        System.out.println("\nRunning Program to calculate area of Rectange : ");
        rectangle();

        System.out.println("\nRunning Program to play mad lib game : ");
        System.out.println("Here we give Grammetical 'words' and it is filled in already written story .");
        MAD_LIB_Game();
    }
    static void MAD_LIB_Game() {
        // The other player provides words without seeing the story.
        // Once all blanks are filled, the story is read aloud with the new words.
        
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        
        System.out.print("Enter an adjective (description): ");
        sc.nextLine();
        adjective1 = sc.nextLine();   //suspicious
        System.out.print("Enter an noun (animal_nm or person_nm): ");
        noun1 = sc.nextLine();          //Mark Zuckerburg
        System.out.print("Enter an adjective (description): ");
        adjective2 = sc.nextLine();    // smelly
        System.out.print("Enter a verb that ends with --ing (action) : " );
        verb1 = sc.nextLine();         //screaming
        System.out.print("Enter an adjective (description): ");
        adjective3 = sc.nextLine();    //Happy
        
        System.out.println("\n Today I went to a " + adjective1 + " zoo. ");
        System.out.println("In an exihibit, i saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");
        
        sc.close(); // Very important step in dynamic allocation & should be in any 'method'
        // after .close() you can't create (system.in)
    }
}
