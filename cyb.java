/*
 * Decompiled with CFR 0.150.
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class cyb {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static bvp a(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(inputStream)));
        try {
            bvp bvp2 = cyb.a(dataInputStream, cny.a);
            return bvp2;
        }
        finally {
            dataInputStream.close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(bvp bvp2, OutputStream outputStream) {
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(outputStream)));
        try {
            cyb.a(bvp2, (DataOutput)dataOutputStream);
        }
        finally {
            dataOutputStream.close();
        }
    }

    public static void a(bvp bvp2, File file) {
        File file2 = new File(file.getAbsolutePath() + "_tmp");
        if (file2.exists()) {
            file2.delete();
        }
        cyb.b(bvp2, file2);
        if (file.exists()) {
            file.delete();
        }
        if (file.exists()) {
            throw new IOException("Failed to delete " + file);
        }
        file2.renameTo(file);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(bvp bvp2, File file) {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            cyb.a(bvp2, (DataOutput)dataOutputStream);
        }
        finally {
            dataOutputStream.close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static bvp a(File file) {
        if (!file.exists()) {
            return null;
        }
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            bvp bvp2 = cyb.a(dataInputStream, cny.a);
            return bvp2;
        }
        finally {
            dataInputStream.close();
        }
    }

    public static bvp a(DataInputStream dataInputStream) {
        return cyb.a(dataInputStream, cny.a);
    }

    public static bvp a(DataInput dataInput, cny cny2) {
        azt azt2 = cyb.a(dataInput, 0, cny2);
        if (azt2 instanceof bvp) {
            return (bvp)azt2;
        }
        throw new IOException("Root tag must be a named compound tag");
    }

    public static void a(bvp bvp2, DataOutput dataOutput) {
        cyb.a((azt)bvp2, dataOutput);
    }

    private static void a(azt azt2, DataOutput dataOutput) {
        dataOutput.writeByte(azt2.a());
        if (azt2.a() == 0) {
            return;
        }
        dataOutput.writeUTF("");
        azt2.a(dataOutput);
    }

    private static azt a(DataInput dataInput, int n2, cny cny2) {
        byte by2 = dataInput.readByte();
        if (by2 == 0) {
            return new bqf();
        }
        dataInput.readUTF();
        azt azt2 = azt.a(by2);
        try {
            azt2.a(dataInput, n2, cny2);
        }
        catch (IOException iOException) {
            cet cet2 = cet.a(iOException, "Loading NBT data");
            sx sx2 = cet2.a("NBT Tag");
            sx2.a("Tag name", "[UNNAMED TAG]");
            sx2.a("Tag type", by2);
            throw new oz(cet2);
        }
        return azt2;
    }
}

