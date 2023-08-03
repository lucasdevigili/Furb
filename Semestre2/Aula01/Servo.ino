#include "Servo.h"

Servo MeuServo;

void setup() {
  // put your setup code here, to run once:
  pinMode(A0, OUTPUT);
  pinMode(A1, INPUT);
  Serial.begin(9600);
  MeuServo.attach(11);
}

void loop() {
  digitalWrite(A0, digitalRead(A1));
  Serial.println(analogRead(A2)); //0...1023
  MeuServo.write(180);
  delay(1000);
  MeuServo.write(90);
  delay(1000);
  MeuServo.write(0);
  delay(1000);
}

// servo + potenciometro

#include "Servo.h"

Servo MeuServo;

void setup() {
  // put your setup code here, to run once:
  pinMode(A0, OUTPUT);
  pinMode(A1, INPUT);
  Serial.begin(9600);
  MeuServo.attach(11);
}

void loop() {
  digitalWrite(A0, digitalRead(A1));
  Serial.println(analogRead(A2)); //0...1023
  MeuServo.write(map(analogRead(A2), 0, 1023, 0, 180));
}
