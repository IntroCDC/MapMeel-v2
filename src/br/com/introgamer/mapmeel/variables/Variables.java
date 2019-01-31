package br.com.introgamer.mapmeel.variables;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.bukkit.plugin.Plugin;

public class Variables {

    public static int Audio = 0;

    public static boolean Block = false;
    public static boolean Buyed = false;
    public static ArrayList<String> ChatPrivate = new ArrayList<>();

    public static ArrayList<String> Commands = new ArrayList<>();
    public static boolean ConfirmOn = false;
    public static String ConfirmType = null;
    public static SimpleDateFormat Dia = new SimpleDateFormat("dd");
    public static SimpleDateFormat DIA = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

    public static double Dinheiro = 0.0;

    public static int failstotal = 0;

    public static boolean GmIntro = true;

    public static SimpleDateFormat Hora = new SimpleDateFormat("HH");

    public static ArrayList<String> inGod = new ArrayList<>();

    public static ArrayList<String> Jogadores = new ArrayList<>();

    public static boolean Jogo = false;

    public static boolean Liberado = true;

    public static boolean MeelBlock = true;

    public static SimpleDateFormat Mes = new SimpleDateFormat("MM");

    public static double MinionCusto = 30.0;

    public static boolean MinionsEnabled = false;

    public static SimpleDateFormat Minuto = new SimpleDateFormat("mm");

    public static int mlg = 0;

    public static boolean MLGCommand = false;

    public static boolean MLGMorreu = false;

    public static double MLGYJogador = 0;

    public static boolean ModoEditor = true;

    public static ArrayList<String> MOTDs = new ArrayList<>();

    public static ArrayList<String> Musics = new ArrayList<>();

    public static ArrayList<String> NaoPassouDoTeste = new ArrayList<>();

    public static boolean PassouDoTesteActive = false;

    public static ArrayList<String> Permitidos = new ArrayList<>();

    public static Plugin plugin = null;

    public static boolean Primeira = true;

    public static SimpleDateFormat Segundo = new SimpleDateFormat("ss");

    public static ArrayList<String> WarpsEx = new ArrayList<>();

}
