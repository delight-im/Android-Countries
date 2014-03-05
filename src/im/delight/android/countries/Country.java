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
import android.content.Context;

/**
 * Provides country codes in accordance with ISO-3166-1 and localized names for each country
 * 
 * New entries must be added in three places: (1) the resources (strings.xml) (2) the hard-coded array of codes below (3) the large switch (list of conditionals) below
 */
public class Country {
	
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
	 * Returns a list of all supported ISO-3166-1 ALPHA-3 codes
	 * 
	 * @return String array containing the ISO-3166-1 ALPHA-3 codes
	 */
	public static String[] getIso3Codes() {
		return new String[] { "CHN", "IND", "USA", "IDN", "BRA", "PAK", "NGA", "BGD", "RUS", "JPN", "MEX", "PHL", "VNM", "ETH", "EGY", "DEU", "IRN", "TUR", "COD", "THA", "FRA", "GBR", "ITA", "MMR", "ZAF", "KOR", "COL", "ESP", "UKR", "TZA", "KEN", "ARG", "DZA", "POL", "SDN", "UGA", "CAN", "IRQ", "MAR", "PER", "UZB", "MYS", "SAU", "VEN", "NPL", "AFG", "YEM", "PRK", "GHA", "MOZ", "AUS", "TWN", "CIV", "SYR", "MDG", "AGO", "CMR", "LKA", "ROU", "BFA", "KAZ", "NER", "NLD", "MWI", "CHL", "ECU", "GTM", "MLI", "KHM", "ZMB", "SEN", "ZWE", "TCD", "SSD", "CUB", "BEL", "TUN", "GIN", "GRC", "RWA", "CZE", "SOM", "PRT", "HTI", "BEN", "BDI", "BOL", "HUN", "SWE", "AZE", "BLR", "DOM", "HND", "AUT", "ARE", "TJK", "ISR", "CHE", "PNG", "BGR", "HKG", "SRB", "PRY", "LAO", "JOR", "SLV", "ERI", "LBY", "TGO", "SLE", "NIC", "KGZ", "DNK", "FIN", "SVK", "SGP", "TKM", "NOR", "LBN", "CRI", "CAF", "IRL", "NZL", "GEO", "COG", "PSE", "LBR", "HRV", "OMN", "BIH" };
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
				// check code against list of most populous countries
				if (countryISO3.equals("CHN")) {
					// rank 1
					out = context.getString(R.string.country_chn);
				}
				else if (countryISO3.equals("IND")) {
					// rank 2
					out = context.getString(R.string.country_ind);
				}
				else if (countryISO3.equals("USA")) {
					// rank 3
					out = context.getString(R.string.country_usa);
				}
				else if (countryISO3.equals("IDN")) {
					// rank 4
					out = context.getString(R.string.country_idn);
				}
				else if (countryISO3.equals("BRA")) {
					// rank 5
					out = context.getString(R.string.country_bra);
				}
				else if (countryISO3.equals("PAK")) {
					// rank 6
					out = context.getString(R.string.country_pak);
				}
				else if (countryISO3.equals("NGA")) {
					// rank 7
					out = context.getString(R.string.country_nga);
				}
				else if (countryISO3.equals("BGD")) {
					// rank 8
					out = context.getString(R.string.country_bgd);
				}
				else if (countryISO3.equals("RUS")) {
					// rank 9
					out = context.getString(R.string.country_rus);
				}
				else if (countryISO3.equals("JPN")) {
					// rank 10
					out = context.getString(R.string.country_jpn);
				}
				else if (countryISO3.equals("MEX")) {
					// rank 11
					out = context.getString(R.string.country_mex);
				}
				else if (countryISO3.equals("PHL")) {
					// rank 12
					out = context.getString(R.string.country_phl);
				}
				else if (countryISO3.equals("VNM")) {
					// rank 13
					out = context.getString(R.string.country_vnm);
				}
				else if (countryISO3.equals("ETH")) {
					// rank 14
					out = context.getString(R.string.country_eth);
				}
				else if (countryISO3.equals("EGY")) {
					// rank 15
					out = context.getString(R.string.country_egy);
				}
				else if (countryISO3.equals("DEU")) {
					// rank 16
					out = context.getString(R.string.country_deu);
				}
				else if (countryISO3.equals("IRN")) {
					// rank 17
					out = context.getString(R.string.country_irn);
				}
				else if (countryISO3.equals("TUR")) {
					// rank 18
					out = context.getString(R.string.country_tur);
				}
				else if (countryISO3.equals("COD")) {
					// rank 19
					out = context.getString(R.string.country_cod);
				}
				else if (countryISO3.equals("THA")) {
					// rank 20
					out = context.getString(R.string.country_tha);
				}
				else if (countryISO3.equals("FRA")) {
					// rank 21
					out = context.getString(R.string.country_fra);
				}
				else if (countryISO3.equals("GBR")) {
					// rank 22
					out = context.getString(R.string.country_gbr);
				}
				else if (countryISO3.equals("ITA")) {
					// rank 23
					out = context.getString(R.string.country_ita);
				}
				else if (countryISO3.equals("MMR")) {
					// rank 24
					out = context.getString(R.string.country_mmr);
				}
				else if (countryISO3.equals("ZAF")) {
					// rank 25
					out = context.getString(R.string.country_zaf);
				}
				else if (countryISO3.equals("KOR")) {
					// rank 26
					out = context.getString(R.string.country_kor);
				}
				else if (countryISO3.equals("COL")) {
					// rank 27
					out = context.getString(R.string.country_col);
				}
				else if (countryISO3.equals("ESP")) {
					// rank 28
					out = context.getString(R.string.country_esp);
				}
				else if (countryISO3.equals("UKR")) {
					// rank 29
					out = context.getString(R.string.country_ukr);
				}
				else if (countryISO3.equals("TZA")) {
					// rank 30
					out = context.getString(R.string.country_tza);
				}
				else if (countryISO3.equals("KEN")) {
					// rank 31
					out = context.getString(R.string.country_ken);
				}
				else if (countryISO3.equals("ARG")) {
					// rank 32
					out = context.getString(R.string.country_arg);
				}
				else if (countryISO3.equals("DZA")) {
					// rank 33
					out = context.getString(R.string.country_dza);
				}
				else if (countryISO3.equals("POL")) {
					// rank 34
					out = context.getString(R.string.country_pol);
				}
				else if (countryISO3.equals("SDN")) {
					// rank 35
					out = context.getString(R.string.country_sdn);
				}
				else if (countryISO3.equals("UGA")) {
					// rank 36
					out = context.getString(R.string.country_uga);
				}
				else if (countryISO3.equals("CAN")) {
					// rank 37
					out = context.getString(R.string.country_can);
				}
				else if (countryISO3.equals("IRQ")) {
					// rank 38
					out = context.getString(R.string.country_irq);
				}
				else if (countryISO3.equals("MAR")) {
					// rank 39
					out = context.getString(R.string.country_mar);
				}
				else if (countryISO3.equals("PER")) {
					// rank 40
					out = context.getString(R.string.country_per);
				}
				else if (countryISO3.equals("UZB")) {
					// rank 41
					out = context.getString(R.string.country_uzb);
				}
				else if (countryISO3.equals("MYS")) {
					// rank 42
					out = context.getString(R.string.country_mys);
				}
				else if (countryISO3.equals("SAU")) {
					// rank 43
					out = context.getString(R.string.country_sau);
				}
				else if (countryISO3.equals("VEN")) {
					// rank 44
					out = context.getString(R.string.country_ven);
				}
				else if (countryISO3.equals("NPL")) {
					// rank 45
					out = context.getString(R.string.country_npl);
				}
				else if (countryISO3.equals("AFG")) {
					// rank 46
					out = context.getString(R.string.country_afg);
				}
				else if (countryISO3.equals("YEM")) {
					// rank 47
					out = context.getString(R.string.country_yem);
				}
				else if (countryISO3.equals("PRK")) {
					// rank 48
					out = context.getString(R.string.country_prk);
				}
				else if (countryISO3.equals("GHA")) {
					// rank 49
					out = context.getString(R.string.country_gha);
				}
				else if (countryISO3.equals("MOZ")) {
					// rank 50
					out = context.getString(R.string.country_moz);
				}
				else if (countryISO3.equals("AUS")) {
					// rank 51
					out = context.getString(R.string.country_aus);
				}
				else if (countryISO3.equals("TWN")) {
					// rank 52
					out = context.getString(R.string.country_twn);
				}
				else if (countryISO3.equals("CIV")) {
					// rank 53
					out = context.getString(R.string.country_civ);
				}
				else if (countryISO3.equals("SYR")) {
					// rank 54
					out = context.getString(R.string.country_syr);
				}
				else if (countryISO3.equals("MDG")) {
					// rank 55
					out = context.getString(R.string.country_mdg);
				}
				else if (countryISO3.equals("AGO")) {
					// rank 56
					out = context.getString(R.string.country_ago);
				}
				else if (countryISO3.equals("CMR")) {
					// rank 57
					out = context.getString(R.string.country_cmr);
				}
				else if (countryISO3.equals("LKA")) {
					// rank 58
					out = context.getString(R.string.country_lka);
				}
				else if (countryISO3.equals("ROU")) {
					// rank 59
					out = context.getString(R.string.country_rou);
				}
				else if (countryISO3.equals("BFA")) {
					// rank 60
					out = context.getString(R.string.country_bfa);
				}
				else if (countryISO3.equals("KAZ")) {
					// rank 61
					out = context.getString(R.string.country_kaz);
				}
				else if (countryISO3.equals("NER")) {
					// rank 62
					out = context.getString(R.string.country_ner);
				}
				else if (countryISO3.equals("NLD")) {
					// rank 63
					out = context.getString(R.string.country_nld);
				}
				else if (countryISO3.equals("MWI")) {
					// rank 64
					out = context.getString(R.string.country_mwi);
				}
				else if (countryISO3.equals("CHL")) {
					// rank 65
					out = context.getString(R.string.country_chl);
				}
				else if (countryISO3.equals("ECU")) {
					// rank 66
					out = context.getString(R.string.country_ecu);
				}
				else if (countryISO3.equals("GTM")) {
					// rank 67
					out = context.getString(R.string.country_gtm);
				}
				else if (countryISO3.equals("MLI")) {
					// rank 68
					out = context.getString(R.string.country_mli);
				}
				else if (countryISO3.equals("KHM")) {
					// rank 69
					out = context.getString(R.string.country_khm);
				}
				else if (countryISO3.equals("ZMB")) {
					// rank 70
					out = context.getString(R.string.country_zmb);
				}
				else if (countryISO3.equals("SEN")) {
					// rank 71
					out = context.getString(R.string.country_sen);
				}
				else if (countryISO3.equals("ZWE")) {
					// rank 72
					out = context.getString(R.string.country_zwe);
				}
				else if (countryISO3.equals("TCD")) {
					// rank 73
					out = context.getString(R.string.country_tcd);
				}
				else if (countryISO3.equals("SSD")) {
					// rank 74
					out = context.getString(R.string.country_ssd);
				}
				else if (countryISO3.equals("CUB")) {
					// rank 75
					out = context.getString(R.string.country_cub);
				}
				else if (countryISO3.equals("BEL")) {
					// rank 76
					out = context.getString(R.string.country_bel);
				}
				else if (countryISO3.equals("TUN")) {
					// rank 77
					out = context.getString(R.string.country_tun);
				}
				else if (countryISO3.equals("GIN")) {
					// rank 78
					out = context.getString(R.string.country_gin);
				}
				else if (countryISO3.equals("GRC")) {
					// rank 79
					out = context.getString(R.string.country_grc);
				}
				else if (countryISO3.equals("RWA")) {
					// rank 80
					out = context.getString(R.string.country_rwa);
				}
				else if (countryISO3.equals("CZE")) {
					// rank 81
					out = context.getString(R.string.country_cze);
				}
				else if (countryISO3.equals("SOM")) {
					// rank 82
					out = context.getString(R.string.country_som);
				}
				else if (countryISO3.equals("PRT")) {
					// rank 83
					out = context.getString(R.string.country_prt);
				}
				else if (countryISO3.equals("HTI")) {
					// rank 84
					out = context.getString(R.string.country_hti);
				}
				else if (countryISO3.equals("BEN")) {
					// rank 85
					out = context.getString(R.string.country_ben);
				}
				else if (countryISO3.equals("BDI")) {
					// rank 86
					out = context.getString(R.string.country_bdi);
				}
				else if (countryISO3.equals("BOL")) {
					// rank 87
					out = context.getString(R.string.country_bol);
				}
				else if (countryISO3.equals("HUN")) {
					// rank 88
					out = context.getString(R.string.country_hun);
				}
				else if (countryISO3.equals("SWE")) {
					// rank 89
					out = context.getString(R.string.country_swe);
				}
				else if (countryISO3.equals("AZE")) {
					// rank 90
					out = context.getString(R.string.country_aze);
				}
				else if (countryISO3.equals("BLR")) {
					// rank 91
					out = context.getString(R.string.country_blr);
				}
				else if (countryISO3.equals("DOM")) {
					// rank 92
					out = context.getString(R.string.country_dom);
				}
				else if (countryISO3.equals("HND")) {
					// rank 93
					out = context.getString(R.string.country_hnd);
				}
				else if (countryISO3.equals("AUT")) {
					// rank 94
					out = context.getString(R.string.country_aut);
				}
				else if (countryISO3.equals("ARE")) {
					// rank 95
					out = context.getString(R.string.country_are);
				}
				else if (countryISO3.equals("TJK")) {
					// rank 96
					out = context.getString(R.string.country_tjk);
				}
				else if (countryISO3.equals("ISR")) {
					// rank 97
					out = context.getString(R.string.country_isr);
				}
				else if (countryISO3.equals("CHE")) {
					// rank 98
					out = context.getString(R.string.country_che);
				}
				else if (countryISO3.equals("PNG")) {
					// rank 99
					out = context.getString(R.string.country_png);
				}
				else if (countryISO3.equals("BGR")) {
					// rank 100
					out = context.getString(R.string.country_bgr);
				}
				else if (countryISO3.equals("HKG")) {
					// rank 101
					out = context.getString(R.string.country_hkg);
				}
				else if (countryISO3.equals("SRB")) {
					// rank 102
					out = context.getString(R.string.country_srb);
				}
				else if (countryISO3.equals("PRY")) {
					// rank 103
					out = context.getString(R.string.country_pry);
				}
				else if (countryISO3.equals("LAO")) {
					// rank 104
					out = context.getString(R.string.country_lao);
				}
				else if (countryISO3.equals("JOR")) {
					// rank 105
					out = context.getString(R.string.country_jor);
				}
				else if (countryISO3.equals("SLV")) {
					// rank 106
					out = context.getString(R.string.country_slv);
				}
				else if (countryISO3.equals("ERI")) {
					// rank 107
					out = context.getString(R.string.country_eri);
				}
				else if (countryISO3.equals("LBY")) {
					// rank 108
					out = context.getString(R.string.country_lby);
				}
				else if (countryISO3.equals("TGO")) {
					// rank 109
					out = context.getString(R.string.country_tgo);
				}
				else if (countryISO3.equals("SLE")) {
					// rank 110
					out = context.getString(R.string.country_sle);
				}
				else if (countryISO3.equals("NIC")) {
					// rank 111
					out = context.getString(R.string.country_nic);
				}
				else if (countryISO3.equals("KGZ")) {
					// rank 112
					out = context.getString(R.string.country_kgz);
				}
				else if (countryISO3.equals("DNK")) {
					// rank 113
					out = context.getString(R.string.country_dnk);
				}
				else if (countryISO3.equals("FIN")) {
					// rank 114
					out = context.getString(R.string.country_fin);
				}
				else if (countryISO3.equals("SVK")) {
					// rank 115
					out = context.getString(R.string.country_svk);
				}
				else if (countryISO3.equals("SGP")) {
					// rank 116
					out = context.getString(R.string.country_sgp);
				}
				else if (countryISO3.equals("TKM")) {
					// rank 117
					out = context.getString(R.string.country_tkm);
				}
				else if (countryISO3.equals("NOR")) {
					// rank 118
					out = context.getString(R.string.country_nor);
				}
				else if (countryISO3.equals("LBN")) {
					// rank 119
					out = context.getString(R.string.country_lbn);
				}
				else if (countryISO3.equals("CRI")) {
					// rank 120
					out = context.getString(R.string.country_cri);
				}
				else if (countryISO3.equals("CAF")) {
					// rank 121
					out = context.getString(R.string.country_caf);
				}
				else if (countryISO3.equals("IRL")) {
					// rank 122
					out = context.getString(R.string.country_irl);
				}
				else if (countryISO3.equals("NZL")) {
					// rank 123
					out = context.getString(R.string.country_nzl);
				}
				else if (countryISO3.equals("GEO")) {
					// rank 124
					out = context.getString(R.string.country_geo);
				}
				else if (countryISO3.equals("COG")) {
					// rank 125
					out = context.getString(R.string.country_cog);
				}
				else if (countryISO3.equals("PSE")) {
					// rank 126
					out = context.getString(R.string.country_pse);
				}
				else if (countryISO3.equals("LBR")) {
					// rank 127
					out = context.getString(R.string.country_lbr);
				}
				else if (countryISO3.equals("HRV")) {
					// rank 128
					out = context.getString(R.string.country_hrv);
				}
				else if (countryISO3.equals("OMN")) {
					// rank 129
					out = context.getString(R.string.country_omn);
				}
				else if (countryISO3.equals("BIH")) {
					// rank 130
					out = context.getString(R.string.country_bih);
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
