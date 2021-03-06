clc;
clear all;
close all;
am = 2;
fm = 4;
fs = 20 * fm;
t = 0:1/fs:1;
x = am * cos(2 * pi * fm * t);
plot(t, x, 'r');
hold on;
figure(1);
xlabel('Time');
ylabel('Amplitude');
title('Input Signal');
for n = 1:length(x)
    if n==1
        e(n) = x(n);
        eq(n) = round(e(n));
        xq(n) = eq(n);
    else
        e(n) = x(n) - xq(n-1);
        eq(n) = round(e(n));
        xq(n) = eq(n) + xq(n-1);
    end
end

for n=1:length(x)
    if n == 1
        xqr(n) = eq(n);
    else
        xqr(n) = eq(n) + xq(n-1);
    end
end

plot(t, xqr, 'k');
xlabel('Time');
ylabel('Amplitude');

legend('Original Signal', 'Reconstructed Signal');