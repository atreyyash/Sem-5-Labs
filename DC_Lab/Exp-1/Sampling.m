%Aim to perform sampling of continuous signal using matlab
clc;
clear all;
close all;
%Message Signal
tf = 0.05;
t=0:0.00005:tf;
f=input('Enter Sampling Frequency :');
xt = cos(2*pi*f*t);
subplot(2,2,1);
plot(t,xt);
xlabel('Time');
ylabel('Amplitude');
title('Msg Signal');

%Under Sampling
fs1 = 1.5*f;
n1 = 0:1/fs1:tf;
xn1 = cos(2*pi*f*n1);
subplot(2,2,2);
plot(t,xt,'g');
hold on;
xlabel('Time');
ylabel('Amplitude');
title('Under Sampled Signal');
stem(n1,xn1,'r*-');

%Ideal Sampling
fs2 = 2*f;
n2 = 0:1/fs2:tf;
xn2 = cos(2*pi*f*n2);
subplot(2,2,3);
plot(t,xt,'g');
hold on;
xlabel('Time');
ylabel('Amplitude');
title('Ideal Sampled Signal');
stem(n2,xn2,'r*-');

%Over Sampling 
fs3 = 2.5*f;
n3 = 0:1/fs3:tf;
xn3 = cos(2*pi*f*n3);
subplot(2,2,4);
plot(t,xt,'g');
hold on;
xlabel('Time');
ylabel('Amplitude');
title('Over Sampled Signal');
stem(n3,xn3,'r*-');