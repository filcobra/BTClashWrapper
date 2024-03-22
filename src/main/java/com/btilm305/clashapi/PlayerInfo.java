package com.btilm305.clashapi;

/**
 * Player specific info.
 */
public interface PlayerInfo extends Player {

    /**
     * Returns the Town Hall level of the player
     *
     * @return the Town Hall level of the player
     */
	int getTownHallLevel();
	
    /**
     * Returns the Weapon level of the player's Town Hall
     *
     * @return the Weapon level of the player's Town Hall
     */
	int getTownHallWeaponLevel();
	
    /**
     * Returns the War Preference of the player. That is, if the player wants to participate in wars.
     *
     * @return the War Preference of the player
     */
	String getWarPreference();	
}
