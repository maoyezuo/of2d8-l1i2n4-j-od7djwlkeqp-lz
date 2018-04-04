package ball.player;

import tools.RandomTool;

public enum PositionStadium {
	 /***/
	  GK
	  /***/
	  , CB1
	  /***/
	  , CB2
	  /***/
	  , CB3
	  /***/
	  , LB
	  /***/
	  , RB
	  /***/
	  , WLB
	  /***/
	  , WRB
	  /***/
	  , DM1
	  /***/
	  , DM2
	  /***/
	  , DM3
	  /***/
	  , MC1
	  /***/
	  , MC2
	  /***/
	  , MC3
	  /***/
	  , ML
	  /***/
	  , MR
	  /***/
	  , AMC1
	  /***/
	  , AMC2
	  /***/
	  , AMC3
	  /***/
	  , AML
	  /***/
	  , AMR
	  /***/
	  , CF1
	  /***/
	  , CF2
	  /***/
	  , CF3
	  
	  
	  ;
	
	public static int randomPosition() {
		return RandomTool.random.nextInt(PositionStadium.values().length);
	}
	
}
