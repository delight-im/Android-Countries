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

import android.content.Context;

public class CountryList {
	
	/**
	 * Returns a list of all supported full country names
	 * 
	 * @param context the Context reference to get the Resources from
	 * @return String array containing the full country names
	 */
	public static String[] getHumanReadable(Context context) {
		return context.getResources().getStringArray(R.array.countries_list_human);
	}
	
	/**
	 * Returns a list of all supported ISO-3166-1 ALPHA-3 codes
	 * 
	 * @param context the Context reference to get the Resources from
	 * @return String array containing the ISO-3166-1 ALPHA-3 codes
	 */
	public static String[] getMachineReadable(Context context) {
		return context.getResources().getStringArray(R.array.countries_list_machine);
	}

}
