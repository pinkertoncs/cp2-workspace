public class Main{
    
    public static void main(String[] args){
    
        System.out.println("*** Tier 1 Testing");
    
        Person p = new Person("Joe", "Dirt");
        Person p2 = new Person("asdf", "qwer");
        Person p3 = new Person("qwer", "qwer");
    
        System.out.println("comparing: " +
          p.compareTo(p) + " " +
          p.compareTo(p2) + " " +
          p3.compareTo(p));
    
        List ll = new List();
    
        ll.push(p);
        ll.push(p2);
        ll.push(p3);
    
        System.out.println("length: " + ll.length());
        System.out.println(ll.toString());
    
        System.out.println("searching: " +
          ll.find(p) + " " +
          ll.find(p2) + " " +
          ll.find(p3));
    
    
        System.out.println("get: " +
          ll.get(0).toString() + " " +
          ll.get(4));
    
            
        System.out.println("removing: ");
        Person temp;
        while(ll.length() > 0 ) {
          temp = ll.pop();
          System.out.println("\t" + 
            temp.toString());
        }
            
        System.out.println("*** Tier 2 Testing");
    
        List ll2 = new List();
        ll2.push(p);
        ll2.insert(0,p2);
        ll2.insert(1,p3);

        System.out.println(ll2.toString());
        
        System.out.println("sorting: ");
        ll2.sort();
        System.out.println(ll2.toString());
        
        System.out.print("removing:\n\t");
        temp = ll2.pop(1);
        System.out.print(temp.toString() + "\n\t");
        temp = ll2.pop(0);
        System.out.print(temp.toString() + "\n\t");
        temp = ll2.pop(0);
        System.out.println(temp.toString());
        System.out.println(ll2.toString());	 
    }
}
        
    