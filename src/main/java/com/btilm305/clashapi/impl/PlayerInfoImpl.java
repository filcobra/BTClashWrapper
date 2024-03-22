package com.btilm305.clashapi.impl;

import org.json.JSONObject;

import com.btilm305.clashapi.League;
import com.btilm305.clashapi.PlayerInfo;

public class PlayerInfoImpl extends PlayerImpl implements PlayerInfo {
	
	private int townHallLevel;
	
	private int townHallWeaponLevel;
	
	private String warPreference;

	protected PlayerInfoImpl(JSONObject root) {
		super(root);
        townHallLevel = root.getInt("townHallLevel");
        if (root.has("townHallWeaponLevel")) {
        	townHallWeaponLevel = root.getInt("townHallWeaponLevel");
        } else {
        	townHallWeaponLevel = 0;
        }
        warPreference = root.getString("warPreference");
	}

	@Override
	public int getTownHallLevel() {
		return townHallLevel;
	}

	@Override
	public int getTownHallWeaponLevel() {
		return townHallWeaponLevel;
	}
	
	@Override
	public String getWarPreference() {
		return warPreference;
	}
	
	
	@Override
	public String toString() {
        return "PlayerInfoImpl{" +
                "townHallLevel=" + townHallLevel +
                ", townHallWeaponLevel=" + townHallWeaponLevel +
                "} " + super.toString();
	}

}
