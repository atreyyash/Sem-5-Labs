%To perform phase shift keying (PSK) using MAtlab

clc;
clear all;
set(0, 'defaultlinelinewidth', 2);

t = 0:0.001:1;

f1 = input('Enter Carrier Frequency : ');
f2 = input('Enter Message Signal : ');

x = 5 * sin(2*pi*f1*t);

subplot(3, 1, 1);
plot(t, x);
xlabel('Time');
ylabel('Amplitude');
title('Carrier Signal');
grid on;
u = square(2*pi*f2*t);
subplot(3, 1, 2);
plot(t, u);
xlabel('Time');
ylabel('Amplitude');
title('Message Signal');
grid on;
v = x.*u;
subplot(3, 1, 3);
plot(t, v);
axis([0 1 -6 6]);
xlabel('Time');
ylabel('Amplitude');
title('PSK');
grid on;