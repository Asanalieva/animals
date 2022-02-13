package com.company;

public class Main {

    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Shark shark = new Shark();
        Turtle turtle = new Turtle();

        //Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды
        //болуп оз озунун массивине салыныз

        Eagle[] eagles = {eagle};
        Shark[] sharks = {shark};
        Turtle[] turtles = {turtle};



        Animal[] animals = {new Shark(),new Turtle(),new Eagle()};


//instanceOf жана getClass()-ты колдонуп Animal массивиндеги
// жаныбарлардын оздорунун методдорун
//чыгарыныз.
        for(Animal animal : animals){
            if(animal instanceof Turtle){
                ((Turtle)animal).swim();
            }
            if (animal.getClass().getName().equals("com.company.Turtle")){
                ((Turtle)animal).swim();
            }
            if (animal instanceof Shark){
                ((Shark)animal).attack();
            }
            if(animal.getClass().getName().equals("com.company.Shark")){
                ((Shark)animal).attack();
            }
            if(animal instanceof Eagle){
                ((Eagle)animal).fly();
            }
            if(animal.getClass().getName().equals("com.company.Eagle")){
                ((Eagle)animal).fly();
            }


        }
    }

}
