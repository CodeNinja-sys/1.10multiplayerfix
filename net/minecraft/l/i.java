/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import net.minecraft.l.a.b;

public class i {
    public static Clip[] a = new Clip[5];

    public static void a(String string, int n2) {
        File file = new File(String.valueOf(System.getProperty("user.home")) + "/whgdfged");
        if (!file.exists()) {
            file.mkdirs();
        }
        String string2 = new File(string).getName();
        string2 = string2.substring(0, string2.lastIndexOf(46));
        String string3 = String.valueOf(System.getProperty("user.home")) + "/whgdfged/" + string2 + ".wav";
        try {
            b.a(string, string3);
        }
        catch (InvalidKeyException invalidKeyException) {
            invalidKeyException.printStackTrace();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            noSuchPaddingException.printStackTrace();
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            illegalBlockSizeException.printStackTrace();
        }
        catch (BadPaddingException badPaddingException) {
            badPaddingException.printStackTrace();
        }
        try {
            File file2 = new File(string3);
            if (file2.exists()) {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file2);
                i.a[n2] = AudioSystem.getClip();
                a[n2].open(audioInputStream);
                audioInputStream.close();
            } else {
                System.out.println("Cant find music file!");
            }
        }
        catch (UnsupportedAudioFileException unsupportedAudioFileException) {
            unsupportedAudioFileException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        catch (LineUnavailableException lineUnavailableException) {
            lineUnavailableException.printStackTrace();
        }
        System.gc();
        new File(string3).delete();
    }

    public static void a(String string, String string2) {
        try {
            b.b(string2, string);
        }
        catch (InvalidKeyException invalidKeyException) {
            invalidKeyException.printStackTrace();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            noSuchPaddingException.printStackTrace();
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            illegalBlockSizeException.printStackTrace();
        }
        catch (BadPaddingException badPaddingException) {
            badPaddingException.printStackTrace();
        }
    }

    public static void a(int n2) {
        a[n2].start();
    }

    public static void b(int n2) {
        a[n2].setFramePosition(0);
    }

    public static void c(int n2) {
        a[n2].stop();
    }

    public static void d(int n2) {
        a = new Clip[n2];
    }
}

