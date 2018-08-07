public class Person implements Comparable<Person>   {
    
        /* class variable for unique ids */
        private static int count = 0;
    
    
        /*instance variables*/
        private int id;
        private String first;
        private String last;
    
        /* ------- Constructors ----------------*/
        
        public Person() {
                this.id = Person.count++;
        }
    
        public Person(String f, String l) {
                this.id = Person.count++;
        }
    
    
        /* ------- Setters -------------------*/
    
        public void setName(String f, String l) {
        }
    
    
        /* --------- Getters --------------*/
    
        public int getId(){
                return this.id;
        }
    
        public String getFirstName(){
                return "";
        }
    
        public String getLastName(){
                return "";
        }
    
        
        /* ------- ToString ------------*/
    
        public String toString(){
                return "";
        }
    
        
        /* ------- Comparison ---------*/
        
        public int compareTo(Person p){
                return 0;
        }
    }
    