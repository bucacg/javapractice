package think.polymorphism.music3;

import think.polymorphism.music.Note;

class newInstrument extends Instrument{
        void play(Note note) {
            System.out.println("newIns.play()" + note); }
    }
