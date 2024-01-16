# basic io
## io streams
- a sequence of data
- an input source and an output destination
    - files, memory arrays, device, socket
- data support
    - bytes
    - characters
    - primitive data types
    - objects

### byte streams
- input and output of 8-bits
- descends from InputStream and OutputStream
- InputStream, impl Closeable
    - FileInputStream
    - ByteArrayInputStream
    - FilterInputStream
        - DataInputStream, impl DataInput
        - BufferedInputStream
    - ObjectInputStream
- OutputStream, impl Closeable, Flushable

### character streams
- input and output of 16-bits
- Input and output done with stream classes automatically translates to and from the local character set
- character stream classes are descended from Reader and Writer
- wrappers for byte streams
    - uses the byte stream to perform the physical I/O
    - the character stream handles translation between characters and bytes
- general-purpose byte-to-character "bridge" streams
    - InputStreamReader
    - OutputStreamWriter
    - Used to create character streams when there are no prepackaged character stream classes that meet your needs
    - line oriented or string of characters
        - BufferedReader
        - PrintWriter

### buffered streams
- read data into buffer memory
- api is called when buffer is empty