# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#io)

## IO API
- Input and Output streams both implements **Autocloseable** interface.
- Reader and Writer streams both implements **Autocloseable** interface.
- can be used in try-with-parameters construct
<table>
<thead>
<tr>
<th></th>
<th>Read</th>
<th>Write</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center" rowspan="4"><strong>Binary</strong></td>
<td align="left"><strong>InputStream</strong></td>
<td align="left"><strong>OutputStream</strong></td>
</tr>
<tr>
<td align="left">FileInputStream</td>
<td align="left">FileOutputStream</td>
</tr>
<tr>
<td align="left">ObjectInputStream</td>
<td align="left">ObjectOutputStream</td>
</tr>
<tr>
<td align="left">PipedInputStream</td>
<td align="left">PipedOutputStream</td>
</tr>
<tr>
<td align="center" rowspan="6"><strong>Character</strong></td>
<td align="left"><strong>Reader</strong></td>
<td align="left"><strong>Writer</strong></td>
</tr>
<tr>
<td align="left">BufferedReader</td>
<td align="left">BufferedWriter</td>
</tr>
<tr>
<td align="left">InputStreamReader</td>
<td align="left">InputStreamWriter</td>
</tr>
<tr>
<td align="left"> - FileReader</td>
<td align="left"> - FileWriter</td>
</tr>
<tr>
<td align="left">PipedReader</td>
<td align="left">PipedWriter</td>
</tr>
<tr>
<td align="left">URLReader</td>
<td align="left">PrintWriter</td>
</tr>
</tbody>
</table>

### InputStream
- read
- close

### OutputStream
- write
- flush  
- close

### Reader
- read
- close

### Writer
- write
- flush
- close

### Console
- Console is not warranted, in that case return null
- readLine
- readPassword
- reader
- writer

## Serialization
- it's not a suitable solution for long-term data storage
- **Serializable** interface is used to indicate permission to serialize instances of a class.
- Serialization includes the entire object graph, except **transient** variables
- If you're trying to serialize an object that does not implement serializable interface, you'll get an exception.

````java
public class PriceList implements Serializable{
    private LocalDate date;
    private Set<Product> items = new HashSet<>();
    private transient String hash = generateHash();
}

public class Product implements Serializable{
    private String name;
    private BigDecimal price;
}

public class Main{
    public static void main(String[] args){
        PriceList list = new PriceList(LocalDate.now());
        list.add(new Drink("Tea",1.9));
    }
}

````

### Path
- represents files and folders
- toRealPath validates existence of the path

### Files
- provides operations that handle **Path** objects
- isDirectory
- isReadable
- isWritable
- isSameFile
- you can look at and set properties of files
- lines > gives a stream of data of lines
- copy, // no copy folder subfolder
- move
- delete // you cannot delete a non-empty directory, delete content first


### FileSystem
- describes available filesystems