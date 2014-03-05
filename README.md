# Android-Countries

Provides country codes in accordance with ISO-3166-1 and localized names for each country

## Installation

 * Create a new library project from this repository and reference it in your project

## Usage

```
String[] countryCodes = Country.getIso3Codes();
// countryCodes now contains "CHN", "IND", "USA", "IDN", "BRA" etc.
```

and

```
String localizedName = Country.getNameByIso3Code(context, "ESP");
// localizedName now contains "Spain" or "España" (etc.) depending on the user's locale
```

## Contribute

If you want to translate existing country names or add new ones, please do so on our platform for managed translations:

[Android-Countries on Localize](http://www.localize.io/v/3l)

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