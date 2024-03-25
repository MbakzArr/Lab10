**Music Media Library README**

**Introduction:**
This repository contains a Java project that implements a Music Media Library. The library includes a class hierarchy consisting of supertype `MusicMedia` and its subtypes `Record`, `AudioFile`, and `CompactDisc`. Additionally, there is a `MusicLibrary` class to manage the collection of music media items.

**Class Hierarchy:**

1. **MusicMedia:**
   - Fields:
     - musical artist
     - song title
     - total number of songs
     - total runtime
     - year
   - Methods:
     - Constructor (overloaded)
     - Getters
     - `toString()`
     - `playSelection()`

2. **Record:**
   - Additional Fields:
     - size of the record in inches
     - revolutions per minute (rpm)
   - Methods:
     - Constructor (overridden)
     - `toString()` (overridden)
     - `playSelection()` (overridden)

3. **AudioFile:**
   - Additional Fields:
     - file type
   - Methods:
     - Constructor (overridden)
     - `toString()` (overridden)
     - `playSelection()` (overridden)

4. **CompactDisc:**
   - Additional Fields:
     - bonus tracks
     - digipac
   - Methods:
     - Constructor (overridden)
     - `toString()` (overridden)
     - `playSelection()` (overridden)

**MusicLibrary Class:**
- Supports an `ArrayList<MusicMedia>`
- Methods:
  - `addMedia(MusicMedia media)`
  - `displayLibrary()`
  - `playTitle(String title)`

**Driver Class:**
A driver class is provided to construct instances of each subtype and add them to the library. The remaining methods of `MusicLibrary` are also tested in the driver class.

**Example Output:**
The example output provided in the lab task demonstrates the functionality of the library, including displaying media information and playing selections.

**How to Use:**
1. Clone the repository to your local machine.
2. Import the project into your preferred Java IDE.
3. Run the driver class to test the Music Media Library functionality.

**Contributing:**
Contributions to the project are welcome. If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

**Authors:**
- [ MbakzArr]
