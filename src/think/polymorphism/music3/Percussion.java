package think.polymorphism.music3;

import think.polymorphism.music.Note;

import static net.mindview.util.Print.print;

class Percussion extends Instrument{
    void play(Note n){
        print("Percussion.play()"+n);}
    public String toString(){
        return "Percussion";}
    void adjust(){
        print("Adjust Percussion");}
}
