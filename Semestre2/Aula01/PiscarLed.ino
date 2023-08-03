void setup()
{
    // Devinição da saida do led
    pinMode(A0, OUTPUT);

    // Criação do seial para saida de vídeo
    Serial.begin(9600);

    // definição da saida do swit
    pinMode(A1, INPUT);
}

void loop()
{
    // Programa para piscar o led
    digitalWrite(A0, HIGH);
    delay(1000);
    digitalWrite(A0, LOW);
    delay(1000);

    // Programa para saida de vídeo
    Serial.println("Hello World");

    //
    Serial.println(digitalRead(A1));

    if (digitalRead(A1) == HIGH)
        digitalWrite(A0, HIGH);
    if (digitalRead(A1) == LOW)
        digitalWrite(A0, LOW);

//
        void loop() {
  digitalWrite(A0, digitalRead(A1));
  Serial.println(analogRead(A2));
}

}
