package think.polymorphism.music3;

import think.polymorphism.music.Note;

import static net.mindview.util.Print.print;

class Stringed extends Instrument{
    void play(Note n){
        print("Stringed.play()"+n);
    }
    public String toString(){
        return "Stringed";
    }
    void adjust(){
        print("Adjust Stringed");
    }
}
