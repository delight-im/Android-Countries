package im.delight.android.countries;

/**
 * Copyright 2014 www.delight.im <info@delight.im>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.HashMap;
import java.util.Locale;
import android.content.Context;

/** Provides country codes in accordance with ISO-3166-1 and localized names for each country */
public class Country {
	
	private static final String RESOURCE_STRING_NAME = "country_%s";
	
	/** Cache class to avoid repeated look-ups of single country codes */
	private static class Cache {
		
		private static Cache mInstance;
		private HashMap<String,String> mMap;
		
		public Cache() {
			mMap = new HashMap<String,String>();
		}
		
		public static Cache getInstance() {
			if (mInstance == null) {
				mInstance = new Cache();
			}
			return mInstance;
		}
		
		public String get(String key) {
			return mMap.get(key);
		}
		
		public void put(String key, String value) {
			mMap.put(key, value);
		}

	}
	
	/**
	 * Returns the localized name for the country with the given ISO-3166-1 ALPHA-3 code
	 * 
	 * @param context Context instance to use in order to access the resources
	 * @param countryISO3 the ISO-3166-1 ALPHA-3 code for the country whose name to look up
	 * @return the country's localized name (if found)
	 * @throws Exception if the country's name could not be found
	 */
	public static String getNameByIso3Code(Context context, String countryISO3) throws Exception {
		if (countryISO3 != null) {
			String out;

			// try to find the code in the cache to avoid the look-up
			out = Cache.getInstance().get(countryISO3);
			// if the code was in the cache
			if (out != null) {
				// just return the cached name
				return out;
			}
			// if the code was not in the cache yet
			else {
				int resID = context.getResources().getIdentifier(String.format(RESOURCE_STRING_NAME, countryISO3.toLowerCase(Locale.US)), "string", context.getPackageName());
				if (resID > 0) {
					out = context.getString(resID);
				}
				else {
					throw new Exception("ISO-3166-1 ALPHA-3 code "+countryISO3+" not found");
				}
				
				// add the code and the corresponding country name to the cache
				Cache.getInstance().put(countryISO3, out);
				
				// return the result of the look-up
				return out;
			}
		}
		else {
			throw new Exception("ISO-3166-1 ALPHA-3 code may not be null");
		}
	}

}
