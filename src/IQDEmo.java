public class IQDEmo {

    class FixedQuake implements ICharQ{
        private char q[];
        private int putloc, getloc;

        public FixedQuake(int size) {
            q = new char[size];
            putloc = getloc = 0;
        }
            //umieszcza znak w kolejnce

        public void put(char ch){
            if(putloc==q.length) {
                System.out.println("--Kolejka pełna.");
                return;
                }

                q[putloc++] = ch;
             }

        public char get(){
            if(putloc==getloc){
                    System.out.println("-- Kolejka pusta");
                    return (char) 0;
                }
            return q[getloc++];

        }

        //kolejka cykliczna
        class CircularQueue implements ICharQ {
            public CircularQueue(int size) {
                q = new char[size+1];
                putloc = getloc = 0;
            }

            public void put(char ch){ //kolejka jet pełna gdy putloc ma wartość mniejsza o jeden niż getloc lub gdy putloc wskazuje koniec tablicy, a getloc poczatek
                if (putloc +1 == getloc || ((putloc == q.length-1) && (getloc == 0))){
                    System.out.println("--Kolejka pełna.");
                    return;

                }

            }

            public char get(){
                
            }
        }




    }
}


