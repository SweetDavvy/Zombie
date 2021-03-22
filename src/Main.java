public class Main {
    public static void main(String[] args) {


    }

    public static class Monster {



        public Monster(String name, int i) {
        }

        public class Zombie extends Monster {

            public Zombie(String name, int damage) {
                super(name + " the Zombie", 5);
            }


            public void growl(){

                super.growl();
            }


            public void attack(){
                super.attack();
                growl();
            }


        }
        private void growl() {
        }

        private void attack() {
        }

    }
     


}

