package com.freshplanet.googleplaygames.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.freshplanet.googleplaygames.Extension;
import com.google.android.gms.games.Games;

public class AirGooglePlayGamesShowLeaderboardFunction implements FREFunction {
	
    final int RC_UNUSED = 6001;
    
	public AirGooglePlayGamesShowLeaderboardFunction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public FREObject call(FREContext arg0, FREObject[] arg1) {

		Extension.context.createHelperIfNeeded(arg0.getActivity());
        if (Extension.context.isSignedIn()) {

        	String leaderboardId = null;
			try
			{
				leaderboardId = arg1[0].getAsString();
			}
			catch (Exception e)
			{
				e.printStackTrace();
				return null;
			}

        	arg0.getActivity().startActivityForResult(Games.Leaderboards.getLeaderboardIntent(Extension.context.getApiClient(), leaderboardId), RC_UNUSED);
        }
		
		return null;
	}

}
