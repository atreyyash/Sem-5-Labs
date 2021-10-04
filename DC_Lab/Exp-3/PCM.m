%To perform pulse code modulation (PCM)
clc;
close all;
%Analog Signal (sinosuidal)
f = 2; %Maximum frequency of the message signal
fs = 20 * f;  %Nyguist Sampling Rate
t = 0:1/fs:1;  %TIme
a=2; %Amplitude
x = a * sin(2*pi*f*t);

%Level Shifting
x1 = x + a;

%Quantization
q_op = round(x1);

%Decimal to binary conversion
enco = de2bi(q_op, 'left-msb');

%PCM Receiver
deco = bi2de(enco, 'left-msb');

%Shifting to amplitude level to original value
xr = deco - a;

%Plotting
plot(t, x, 'r-', t, xr, 'k+-');
xlabel('Time');
ylabel('Amplitude');
legend('Original Signal', 'Reconstructed Signal');