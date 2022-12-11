// An example of inheritance in java the class Repeater extends the class Speaker

public class Speaker {
    String b;
    Speaker( String c){
   assert c!=null;
   b=c;
    }
    public String toString(){
        return b;
    }
    

}

class Repeater extends Speaker{
    Repeater(String c){
        super(c);}
        public String toString(){
            return super.toString()+" "+super.toString();
        }

    }
