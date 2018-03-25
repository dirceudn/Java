package effective.finalizersandcleaners;

import sun.misc.Cleaner;

//An autocloseable class using a cleaner as a safety net
public class Room implements AutoCloseable{

	private static final Cleaner cleaner = Cleaner.create(null, null);
	
	//Resource that requires cleaning. Must not refer to Room.
	
	private static class State implements Runnable{
		int numJunkPiles; // Number of junk piles in this room.
		 
		State(int numJunkPiles){
			this.numJunkPiles = numJunkPiles;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("cleaning room");
			numJunkPiles = 0;
			
		}
		
	}
	
	//The state of this room, shared with our cleanable.
	private State state =  null;
	
	//Our cleanable. Cleans the room when it's eligible for gc.
	private Cleaner cleanable = null;
	
	public Room(int numJunkPile) {
		state = new State(numJunkPile);
		cleanable = cleaner.create(this,state);
	}
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		cleanable.clear();
		
	}

}
