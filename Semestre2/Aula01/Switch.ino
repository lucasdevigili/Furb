void setup()
{
    // Devinição da saida do led
    pinMode(A0, OUTPUT);
}

void loop()
{
    if (digitalRead(A1) == HIGH)
        digitalWrite(A0, HIGH);
    if (digitalRead(A1) == LOW)
        digitalWrite(A0, LOW);
}
