package day0725.exted;


    class Teacher extends People{
        public Teacher(){

        }
        public Teacher(String name,int age){
            super(name,age);
        }
        public void teach(){
            System.out.println("我是老师，我爱学生");
        }

    }

