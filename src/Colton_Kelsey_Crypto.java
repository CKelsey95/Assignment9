import java.io.*;

public class Colton_Kelsey_Crypto {


    public  void encryptFile(String existing, String encrypted){

    boolean eof = false;

    
    FileInputStream inStream = new inputstream(existing);
    DataInputStream = new datainputStream(instream);

    FileOutPutStream outStream = new fileoutput(encrypted);
    DataOutPutStream OutFile = new dataoutput(outStream);

    while (!eof)

    try{ byte input = inputfile.readByte();
    input += 15;

    outputFile.writeByte(output);
    }

    catch (EOFException e)
    {
        eof = true;
    }
    



}
}
