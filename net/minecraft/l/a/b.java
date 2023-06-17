/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l.a;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;
import net.minecraft.client.r;
import net.minecraft.l.a.a;

public class b {
    private static final String c = "AES";
    private static final String d = "AES";
    public static ArrayList a = new ArrayList();
    public static ArrayList b = new ArrayList();

    public static void a(String string, String string2) {
        String string3 = "85A5479B9685I129";
        if (new File(string2).exists()) {
            new File(string2).delete();
        }
        File file = new File(string);
        File file2 = new File(string2);
        try {
            net.minecraft.l.a.b.b(string3, file, file2);
        }
        catch (a a2) {
            System.out.println(a2.getMessage());
            a2.printStackTrace();
            r.z().n();
        }
    }

    public static void b(String string, String string2) {
        String string3 = "85A5479B9685I129";
        File file = new File(string2);
        File file2 = new File(string);
        try {
            net.minecraft.l.a.b.a(string3, file, file2);
        }
        catch (a a2) {
            System.out.println(a2.getMessage());
            a2.printStackTrace();
        }
    }

    public static void a(String string, File file, File file2) {
        net.minecraft.l.a.b.a(1, string, file, file2);
    }

    public static void b(String string, File file, File file2) {
        net.minecraft.l.a.b.a(2, string, file, file2);
    }

    private static void a(int n2, String string, File file, File file2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(string.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(n2, secretKeySpec);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] arrby = new byte[(int)file.length()];
            fileInputStream.read(arrby);
            byte[] arrby2 = cipher.doFinal(arrby);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(arrby2);
            fileInputStream.close();
            fileOutputStream.close();
        }
        catch (IOException iOException) {
            throw new a("Error encrypting/decrypting file", iOException);
        }
    }

    public static BufferedImage a(String string) {
        for (int i2 = 0; i2 < b.size(); ++i2) {
            if (!((String)b.get(i2)).equals(string)) continue;
            return (BufferedImage)a.get(i2);
        }
        String string2 = "85A5479B9685I129";
        File file = new File(string);
        try {
            BufferedImage bufferedImage = net.minecraft.l.a.b.a(2, string2, file);
            a.add(bufferedImage);
            b.add(string);
            return bufferedImage;
        }
        catch (a a2) {
            System.out.println(a2.getMessage());
            a2.printStackTrace();
            return null;
        }
    }

    public static BufferedImage a(int n2, String string, File file) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(string.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(n2, secretKeySpec);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] arrby = new byte[(int)file.length()];
            fileInputStream.read(arrby);
            byte[] arrby2 = cipher.doFinal(arrby);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby2);
            BufferedImage bufferedImage = ImageIO.read(byteArrayInputStream);
            fileInputStream.close();
            return bufferedImage;
        }
        catch (IOException iOException) {
            throw new a("Error encrypting/decrypting file", iOException);
        }
    }
}

