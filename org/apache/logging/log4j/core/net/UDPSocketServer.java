/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.core.a;
import org.apache.logging.log4j.core.config.f;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.net.aq;
import org.apache.logging.log4j.d;

public class UDPSocketServer
extends a
implements Runnable {
    private final d a;
    private static final int b = 65534;
    private volatile boolean c = true;
    private final DatagramSocket d;
    private final int e = 67584;

    public UDPSocketServer(int n2) {
        this.d = new DatagramSocket(n2);
        this.a = org.apache.logging.log4j.c.b(this.getClass().getName() + '.' + n2);
    }

    public static void main(String[] arrstring) {
        String string;
        if (arrstring.length < 1 || arrstring.length > 2) {
            System.err.println("Incorrect number of arguments");
            UDPSocketServer.b();
            return;
        }
        int n2 = Integer.parseInt(arrstring[0]);
        if (n2 <= 0 || n2 >= 65534) {
            System.err.println("Invalid port number");
            UDPSocketServer.b();
            return;
        }
        if (arrstring.length == 2 && arrstring[1].length() > 0) {
            f.a(new aq(arrstring[1]));
        }
        UDPSocketServer uDPSocketServer = new UDPSocketServer(n2);
        Thread thread = new Thread(uDPSocketServer);
        thread.start();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (!((string = bufferedReader.readLine()) == null || string.equalsIgnoreCase("Quit") || string.equalsIgnoreCase("Stop") || string.equalsIgnoreCase("Exit"))) {
        }
        uDPSocketServer.a();
        thread.join();
    }

    private static void b() {
        System.out.println("Usage: ServerSocket port configFilePath");
    }

    public void a() {
        this.c = false;
        Thread.currentThread().interrupt();
    }

    @Override
    public void run() {
        while (this.c) {
            try {
                byte[] arrby = new byte[67584];
                DatagramPacket datagramPacket = new DatagramPacket(arrby, arrby.length);
                this.d.receive(datagramPacket);
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength()));
                h h2 = (h)objectInputStream.readObject();
                if (h2 == null) continue;
                this.a(h2);
            }
            catch (OptionalDataException optionalDataException) {
                this.a.b("OptionalDataException eof=" + optionalDataException.eof + " length=" + optionalDataException.length, (Throwable)optionalDataException);
            }
            catch (ClassNotFoundException classNotFoundException) {
                this.a.b("Unable to locate LogEvent class", (Throwable)classNotFoundException);
            }
            catch (EOFException eOFException) {
                this.a.d("EOF encountered");
            }
            catch (IOException iOException) {
                this.a.b("Exception encountered on accept. Ignoring. Stack Trace :", (Throwable)iOException);
            }
        }
    }
}

