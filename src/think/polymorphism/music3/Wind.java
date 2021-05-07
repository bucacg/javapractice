package think.polymorphism.music3;

import think.polymorphism.music.Note;

import static net.mindview.util.Print.print;

class Wind extends Instrument{
        //重写接口方法
        public void play(Note n){
            System.out.println("Wind.play()"+n);
        }
        String what() {
            return "Wind"; }
        void adjust() {
            System.out.println("Adjusting Wind"); }
    }