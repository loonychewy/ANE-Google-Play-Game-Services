package com.freshplanet.googleplaygames.functions;

import android.content.Intent;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;
import com.freshplanet.googleplaygames.Extension;

public class AirGooglePlayGamesIsSignedInFunction implements FREFunction {

	public AirGooglePlayGamesIsSignedInFunction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public FREObject call(FREContext arg0, FREObject[] arg1) {

		Extension.context.createHelperIfNeeded(arg0.getActivity());

		FREObject isSignedIn = null;
		try {
			isSignedIn = FREObject.newObject(Extension.context.isSignedIn());
		} catch (FREWrongThreadException e) {
			e.printStackTrace();
		}
		return isSignedIn;
	}

}
