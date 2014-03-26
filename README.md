# Android-Countries

Provides country codes in accordance with ISO-3166-1 and localized names for each country

## Installation

 * Create a new library project from this repository and reference it in your project

## Usage

### Custom country preference in your `PreferenceActivity`

Add the following code to your XML for the preferences. The class `CountryPreference` extends `ListPreference` and has the same appearance. It ignores the attributes `android:entries`, `android:entryValues`, `android:defaultValue` and `android:summary` because it comes with its own implementation for those.

Be sure to set `android:key` to the preference key that you want to store the country code in. For `android:title`, provide a value from your string resources, for example, which will be used as the preference's caption.

```
<im.delight.android.countries.CountryPreference
	android:key="country"
	android:title="..."
	android:enabled="true"
	android:selectable="true" />
```

### Retrieving a list of all supported short codes

```
String[] countryCodes = CountryList.getMachineReadable(context);
// countryCodes now contains "CHN", "IND", "USA", "IDN", "BRA" etc.
```

### Retrieving a list of all supported full names

```
String[] countryNames = CountryList.getHumanReadable(context);
// countryNames now contains "China", "India", "United States", "Indonesia", "Brazil" etc. (depending on the user's locale)
```

### Getting a country's full name by its short code

```
String localizedName = Country.getNameByIso3Code(context, "ESP");
// localizedName now contains "Spain" or "España" (etc.) depending on the user's locale
```

## Adding new countries

 1. Create a new entry at the end of the string array `countries_short_codes` in `res/values/short_codes.xml`
 2. Add the full name of the country (at least for English) to our [platform for managed translations](http://www.localize.io/v/3l)
 3. Create a new entry at the end of the string array `countries_full_names` in `res/values/full_names.xml`, referencing the new `country_xxx` resource that has just been submitted in the step before

## Translating country names

If you want to translate existing country names, please do so on our [platform for managed translations](http://www.localize.io/v/3l).

## License

```
Copyright 2014 www.delight.im <info@delight.im>

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```