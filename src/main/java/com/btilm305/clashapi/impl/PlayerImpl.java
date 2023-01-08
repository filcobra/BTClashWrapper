package com.btilm305.clashapi.impl;

import com.btilm305.clashapi.League;
import com.btilm305.clashapi.Player;
import org.json.JSONObject;

public abstract class PlayerImpl implements Player {

    protected String name;
    protected int expLevel;
    protected int trophies;
    protected League league;
    protected String playerTag;

	protected PlayerImpl(JSONObject root) {
        name = root.getString("name");
        expLevel = root.getInt("expLevel");
        if (root.has("league")) {
            league = new LeagueImpl(root.getJSONObject("league"));
        }
        trophies = root.getInt("trophies");
        playerTag = root.getString("tag");
        
    }

    public int getExpLevel() {
        return expLevel;
    }

    public League getLeague() {
        return league;
    }

    public String getName() {
        return name;
    }

    public int getTrophies() {
        return trophies;
    }

    public String getPlayerTag() {
		return playerTag;
	}

    @Override
    public String toString() {
        return "PlayerImpl{" +
                "name='" + name + '\'' +
                '('+playerTag+')' +
                ", expLevel=" + expLevel +
                ", trophies=" + trophies +
                ", league=" + league +
                '}';
    }
}
