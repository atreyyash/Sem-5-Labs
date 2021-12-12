%Dm Transmitter
clc;
clear all;
close all;
am = 1;   %Amplitude
fm = 1;   %Frequency
fs = 20 * fm;   %Over Sampling
t = 0:1/fs:1;   %Time
x = am * cos(2 * pi * fm * t);   %Input Sinusoidal Signal
plot(x, 'm.-');
hold on;
d = (2*pi*fm)/fs;  %Step Size

for n=1:length(x)
    if n==1
        e(n) = x(n);
        eq(n) = d * sign(e(n));
        xq(n) = eq(n);
    else
        e(n) = x(n) - xq(n-1);
        eq(n) = d * sign(e(n));
        xq(n) = eq(n) + xq(n-1);
    end
end

stairs(xq, 'black');