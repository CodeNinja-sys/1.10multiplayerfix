/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

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
import net.minecraft.e.a;
import net.minecraft.e.e;
import net.minecraft.e.g;
import net.minecraft.e.l;
import net.minecraft.k.i;
import net.minecraft.u.bo;

public class h {
    public static e a(InputStream inputStream) {
        e e2;
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(inputStream)));){
            e2 = h.a(dataInputStream, l.a);
        }
        return e2;
    }

    public static void a(e e2, OutputStream outputStream) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(outputStream)));){
            h.a(e2, (DataOutput)dataOutputStream);
        }
    }

    public static void a(e e2, File file) {
        File file2 = new File(String.valueOf(file.getAbsolutePath()) + "_tmp");
        if (file2.exists()) {
            file2.delete();
        }
        h.b(e2, file2);
        if (file.exists()) {
            file.delete();
        }
        if (file.exists()) {
            throw new IOException("Failed to delete " + file);
        }
        file2.renameTo(file);
    }

    public static void b(e e2, File file) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));){
            h.a(e2, (DataOutput)dataOutputStream);
        }
    }

    public static e a(File file) {
        e e2;
        if (!file.exists()) {
            return null;
        }
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));){
            e2 = h.a(dataInputStream, l.a);
        }
        return e2;
    }

    public static e a(DataInputStream dataInputStream) {
        return h.a(dataInputStream, l.a);
    }

    public static e a(DataInput dataInput, l l2) {
        a a2 = h.a(dataInput, 0, l2);
        if (a2 instanceof e) {
            return (e)a2;
        }
        throw new IOException("Root tag must be a named compound tag");
    }

    public static void a(e e2, DataOutput dataOutput) {
        h.a((a)e2, dataOutput);
    }

    private static void a(a a2, DataOutput dataOutput) {
        dataOutput.writeByte(a2.a());
        if (a2.a() != 0) {
            dataOutput.writeUTF("");
            a2.a(dataOutput);
        }
    }

    private static a a(DataInput dataInput, int n2, l l2) {
        byte by2 = dataInput.readByte();
        if (by2 == 0) {
            return new g();
        }
        dataInput.readUTF();
        a a2 = a.a(by2);
        try {
            a2.a(dataInput, n2, l2);
            return a2;
        }
        catch (IOException iOException) {
            net.minecraft.k.a a3 = net.minecraft.k.a.a(iOException, "Loading NBT data");
            i i2 = a3.a("NBT Tag");
            i2.a("Tag name", "[UNNAMED TAG]");
            i2.a("Tag type", by2);
            throw new bo(a3);
        }
    }
}

