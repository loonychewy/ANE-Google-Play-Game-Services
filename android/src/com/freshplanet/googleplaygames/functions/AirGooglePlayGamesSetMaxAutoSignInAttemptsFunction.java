package com.freshplanet.googleplaygames.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.freshplanet.googleplaygames.Extension;

public class AirGooglePlayGamesSetMaxAutoSignInAttemptsFunction implements FREFunction {

	public AirGooglePlayGamesSetMaxAutoSignInAttemptsFunction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public FREObject call(FREContext arg0, FREObject[] arg1) {
		int maxAutoSignInAttempts = 0;
		try
		{
			maxAutoSignInAttempts = arg1[0].getAsInt();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}

		Extension.context.createHelperIfNeeded(arg0.getActivity());
		Extension.context.setMaxAutoSignInAttempts(maxAutoSignInAttempts);
		
		return null;
	}

}
