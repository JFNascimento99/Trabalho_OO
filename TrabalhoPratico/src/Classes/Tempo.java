package Classes;

import java.util.Scanner;
import java.util.Date;

public class Tempo {
 // Tempo vai herdar o tempo final para pedido para termos o valor final
 // Atributos
 private String horaCheckin;
 private String horaCheckout;
 private int horaInicial, minInicial;
 private int horaFinal, minFinal;
 private double tempoTotal;

 // Metodo construtor do Tempo
 public Tempo(String horaCheckin, String horaCheckout) {
  this.horaCheckin = horaCheckin;
  this.horaCheckout = horaCheckout;

  this.horaInicial = Integer.parseInt(horaCheckin.split(":")[0]);
  this.minInicial = Integer.parseInt(horaCheckin.split(":")[1]);
  this.horaFinal = Integer.parseInt(horaCheckout.split(":")[0]);
  this.minFinal = Integer.parseInt(horaCheckout.split(":")[1]);

  this.tempoTotal = calcTempoTotal(horaInicial, minInicial, horaFinal, minFinal);
 }

 private double calcTempoTotal(int horaInicial, int minInicial, int horaFinal, int minFinal) {
  int difHoras, calcMinutos;
  double horaDecimal;
  String horaStr;

  if (horaInicial > horaFinal) {
   difHoras = ((horaFinal + 24) - horaInicial);
  } else {
   difHoras = horaFinal - horaInicial;
  }

  calcMinutos = (difHoras * 60 - minInicial) + minFinal;

  if (calcMinutos <= 0) {
   return -1; // Testar se for -1, caso -1, hora inv�lida
  }
  horaDecimal = (double) (calcMinutos) / (double) (60);
  System.out.println(horaDecimal);
  horaStr = horaDoubleToStr(horaDecimal);
  return horaDecimal;
 }

 public static String horaDoubleToStr(double hora) {
  String horaStr = "";
  int qtdHoras = 0, qtdMinutos = 0;
  // Para transformar em hora HH:mm
  while (hora >= 1) {
   hora--;
   qtdHoras++;
  }
  qtdMinutos = (int) (hora * 60);
  if (qtdHoras < 10) {
   horaStr += "0";
  }
  horaStr += String.valueOf(qtdHoras) + ":";
  if (qtdMinutos < 10) {
   horaStr += "0";
  }
  horaStr += String.valueOf(qtdMinutos);
  System.out.println(horaStr);
  return horaStr;
 }

 public String getHoraCheckIn() {
  return horaCheckin;
 }

 public void setHoraCheckIn(String horaCheckIn) {
  this.horaCheckin = horaCheckIn;
 }

 public String getHoraCheckOut() {
  return horaCheckout;
 }

 public void setHoraCheckOut(String horaCheckOut) {
  this.horaCheckout = horaCheckOut;
 }

 public double getTempoTotal() {
  return tempoTotal;
 }

 public void setTempoTotal(double tempoTotal) {
  this.tempoTotal = tempoTotal;
 }

 // Metodos
 public void cadastrarTempo() {
  // Cadastrar a hora de checkin e checkout e com isso ter o tempo final.
  // Utilizaremos o tempo final pro pedido pra gerar o pedido com valor por hora

  Scanner resposta = new Scanner(System.in); // Leitura de dados
  // Variaveis pra brincar com a logica apenas, pq tenho que achar como fazer as
  // funcoes de hora mais funcionais
  double checkinProvisorio = 0;
  double checkoutProvisorio = 0;
  double tempoTotalProvisorio = 0;

  System.out.println("Insira seu horario de checkin: ");
  checkinProvisorio = resposta.nextDouble();
 }

 public void editarTempo() {
  // Editar hora de checkin e checkout e consequentemente o tempo final
 }

 public void deletarTempo() {
  // Resetar todos os dados de tempo fazendo ficar null
 }

 public void verTempo() {
  // Ver a hora de check in e checkout e tambem o tempo final.
 }

 public void atualizarTempo() {
  // Quando se editar ou cadastrar ver o tempo atualizado
 }

}