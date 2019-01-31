package br.com.introgamer.mapmeel.listeners;

import java.util.Calendar;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import br.com.introgamer.mapmeel.variables.Jogadores;
import br.com.introgamer.mapmeel.variables.Strings;
import br.com.introgamer.mapmeel.variables.Variables;

public class MOTDManager implements Listener {

    @EventHandler
    public void onServerListPing(ServerListPingEvent e) {
        if (Bukkit.getPlayer(Jogadores.Meel) != null) {
            e.setMotd(Strings.prefix + "ß4ßlA Meel Est· no Servidor!");

            e.setMaxPlayers(Bukkit.getServer().getOnlinePlayers().size());
        } else {
            e.setMaxPlayers(Bukkit.getServer().getOnlinePlayers().size() + 1);

            Random Randomizador = new Random();

            String MOTDEscolhido = Variables.MOTDs.get(Randomizador.nextInt(Variables.MOTDs.size()));

            if (MOTDEscolhido.equalsIgnoreCase("DIASRestantes")) {

                int DiasRestantes;
                int HorasRestantes;
                int MinutosRestantes;
                int SegundosRestantes;

                String MesStringAtual = Variables.Mes.format(Calendar.getInstance().getTime());
                String DiaStringAtual = Variables.Dia.format(Calendar.getInstance().getTime());
                String HoraStringAtual = Variables.Hora.format(Calendar.getInstance().getTime());
                String MinutoStringAtual = Variables.Minuto.format(Calendar.getInstance().getTime());
                String SegundoStringAtual = Variables.Segundo.format(Calendar.getInstance().getTime());

                int MesAtual = (int) Double.parseDouble(MesStringAtual);
                int DiaAtual = (int) Double.parseDouble(DiaStringAtual);
                int HoraAtual = (int) Double.parseDouble(HoraStringAtual);
                int MinutoAtual = (int) Double.parseDouble(MinutoStringAtual);
                int SegundoAtual = (int) Double.parseDouble(SegundoStringAtual);

                DiasRestantes = 41 - DiaAtual;
                HorasRestantes = 24 - HoraAtual;
                MinutosRestantes = 60 - MinutoAtual;
                SegundosRestantes = 60 - SegundoAtual;

                if (DiaAtual == 10) {
                    e.setMotd(Strings.prefix + "ß6ßlßo… HOJE :3333333333");
                    return;
                }

                if (DiasRestantes == 1) {
                    if (HorasRestantes == 1) {
                        if (MinutosRestantes == 1) {
                            if (SegundosRestantes == 1) {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundo!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundo!");
                                }
                            } else {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundos!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundos!");
                                }
                            }
                        } else {
                            if (SegundosRestantes == 1) {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundo!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundo!");
                                }
                            } else {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundos!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundos!");
                                }
                            }
                        }
                    } else {
                        if (MinutosRestantes == 1) {
                            if (SegundosRestantes == 1) {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundo!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundo!");
                                }
                            } else {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundos!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundos!");
                                }
                            }
                        } else {
                            if (SegundosRestantes == 1) {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundo!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundo!");
                                }
                            } else {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundos!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dia, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundos!");
                                }
                            }
                        }
                    }
                } else {
                    if (HorasRestantes == 1) {
                        if (MinutosRestantes == 1) {
                            if (SegundosRestantes == 1) {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundo!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundo!");
                                }
                            } else {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundos!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundos!");
                                }
                            }
                        } else {
                            if (SegundosRestantes == 1) {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundo!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundo!");
                                }
                            } else {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundos!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Hora, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundos!");
                                }
                            }
                        }
                    } else {
                        if (MinutosRestantes == 1) {
                            if (SegundosRestantes == 1) {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundo!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundo!");
                                }
                            } else {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundos!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minuto e " + SegundosRestantes + " Segundos!");
                                }
                            }
                        } else {
                            if (SegundosRestantes == 1) {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundo!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundo!");
                                }
                            } else {
                                if (MesAtual == 1) {
                                    DiasRestantes = 10 - DiaAtual;
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundos!");
                                } else {
                                    e.setMotd(Strings.prefix + "ß6Falta " + DiasRestantes + " Dias, " + HorasRestantes + " Horas, " + MinutosRestantes + " Minutos e " + SegundosRestantes + " Segundos!");
                                }
                            }
                        }
                    }
                }

            } else if (MOTDEscolhido.equalsIgnoreCase("DIA")) {
                String DiaStringAtual = "" + Variables.DIA.format(Calendar.getInstance().getTime());
                e.setMotd(Strings.prefix + "ß6Agora s„o: ße" + DiaStringAtual);
            } else {
                e.setMotd(MOTDEscolhido);
            }
        }
    }

}
