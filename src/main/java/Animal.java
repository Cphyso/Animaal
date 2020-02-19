public class Animal {

        private String name;

        void sound(){

            System.out.println();
        }

        void eat() {

            System.out.println(name + " eats");

        }

        public String getName(){
            return name;
        }

        public void setName(String newName){
            this.name = newName;
        }


}
